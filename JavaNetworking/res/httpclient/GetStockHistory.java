
package de.vogella.stockticker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

public class GetStockHistory {

  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

  NumberFormat nf = NumberFormat.getInstance(Locale.US);

  NumberFormat pf = NumberFormat.getInstance(Locale.US);

  StockHistory history = new StockHistory();

  public ArrayList<StockData> updateHistory(String company) {

    Calendar from = Calendar.getInstance();
    Calendar to = Calendar.getInstance();
    to.set(2009, 01, 01);
    from.set(2006, 01, 01);
    System.out.println(to.toString());
    StringBuffer url = new StringBuffer(
        "http://ichart.finance.yahoo.com/table.csv" + "?s=");
    url.append(company);

    try {
      HttpClient client = new HttpClient();
      client.getHostConfiguration().setProxy("proxy", 8080); // Delete
      // this Line
      // if you
      // do not use
      // a proxy
      client.getHttpConnectionManager().getParams().setConnectionTimeout(
          5000);
      System.out.println(url.toString());
      HttpMethod method = new GetMethod(url.toString());
      method.setFollowRedirects(true);
      client.executeMethod(method);
      BufferedReader in = new BufferedReader(new InputStreamReader(method
          .getResponseBodyAsStream()));
      // The first line is the header, ignoring
      String inputLine = in.readLine();

      while ((inputLine = in.readLine()) != null) {
        if (inputLine.startsWith("<"))
          continue;
        String[] item = inputLine.split(",");
        if (item.length < 6)
          continue;

        Calendar day = Calendar.getInstance();
        day.setTime(df.parse(item[0].replace("\"", "")));
        day.set(Calendar.HOUR, 0);
        day.set(Calendar.MINUTE, 0);
        day.set(Calendar.SECOND, 0);
        day.set(Calendar.MILLISECOND, 0);
        StockData data = new StockData();
        data.setOpen(Double.parseDouble(item[1].replace(',', '.')));
        data.setHigh(Double.parseDouble(item[2].replace(',', '.')));
        data.setLow(Double.parseDouble(item[3].replace(',', '.')));
        data.setClose(Double.parseDouble(item[4].replace(',', '.')));
        data.setVolume(Long.parseLong(item[5]));
        data.setDate(df.parse(item[0].replace("\"", "")));
        history.add(data);
      }
      in.close();
      return history.m_stockHistory;

    } catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }

  }


  
  public static void main(String[] args) {
//    GetStockHistory gsh = new GetStockHistory();
//    ArrayList<StockData> sd = gsh.getNewHistory();
//
//    for(int i=0;i < sd.size(); i++)
//    {
//      System.out.println(sd.get(i).getDate());
//    }
  }
}
