package ca.odell.glazedlists;

import ca.odell.glazedlists.event.ListEvent;
import ca.odell.glazedlists.event.ListEventListener;
import ca.odell.glazedlists.event.ListEventPublisher;
import ca.odell.glazedlists.util.concurrent.ReadWriteLock;

import java.util.Collection;
import java.util.List;

public interface EventList<E> extends List<E> {

	public void addListEventListener(ListEventListener<? super E> listChangeListener);

	public void removeListEventListener(ListEventListener<? super E> listChangeListener);

	public ReadWriteLock getReadWriteLock();

	public ListEventPublisher getPublisher();

	public void dispose();
}