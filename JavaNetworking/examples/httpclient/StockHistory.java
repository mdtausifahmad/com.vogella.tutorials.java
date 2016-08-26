
package de.vogella.stockticker;

import java.util.ArrayList;

public class StockHistory {
  ArrayList<StockData> m_stockHistory;
  
  public StockHistory() {
    m_stockHistory = new ArrayList<StockData>();
  }
  public void add (StockData data) {
    m_stockHistory.add(data);
  }
}
