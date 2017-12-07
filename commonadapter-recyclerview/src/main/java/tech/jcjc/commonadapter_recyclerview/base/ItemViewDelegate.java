package tech.jcjc.commonadapter_recyclerview.base;


/**
 * Created by CHENQIAO on 2017/12/07.
 * E-mail: mrjctech@gmail.com
 */

public interface ItemViewDelegate<T> {

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);
}
