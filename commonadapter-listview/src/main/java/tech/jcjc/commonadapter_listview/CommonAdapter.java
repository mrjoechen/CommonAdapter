package tech.jcjc.commonadapter_listview;

import android.content.Context;


import java.util.List;

import tech.jcjc.commonadapter_listview.base.ItemViewDelegate;

/**
 * Created by CHENQIAO on 2017/12/07.
 * E-mail: mrjctech@gmail.com
 */
public abstract class CommonAdapter<T> extends MultiItemTypeAdapter<T> {

    public CommonAdapter(Context context, final int layoutId, List<T> datas) {
        super(context, datas);

        addItemViewDelegate(new ItemViewDelegate<T>() {
            @Override
            public int getItemViewLayoutId() {
                return layoutId;
            }

            @Override
            public boolean isForViewType(T item, int position) {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, int position) {
                CommonAdapter.this.convert(holder, t, position);
            }
        });
    }

    protected abstract void convert(ViewHolder viewHolder, T item, int position);
}
