package tech.jcjc.commonadapter_listview.base;


import tech.jcjc.commonadapter_listview.ViewHolder;

/**
 * Created by CHENQIAO on 2017/12/07.
 * E-mail: mrjctech@gmail.com
 */
public interface ItemViewDelegate<T> {

    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);
}
