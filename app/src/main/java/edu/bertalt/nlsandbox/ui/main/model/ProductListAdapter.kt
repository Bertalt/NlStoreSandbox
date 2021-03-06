package edu.bertalt.nlsandbox.ui.main.model

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import edu.bertalt.nlsandbox.R
import edu.bertalt.nlsandbox.storage.realm.NlRealmBuilder
import edu.bertalt.nlsandbox.storage.realm.model.ProductRealm
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter


class ProductListAdapter(data: OrderedRealmCollection<ProductRealm>)
    : RealmRecyclerViewAdapter<ProductRealm, ProductListAdapter.ProductHolder>(data, true) {


    val mOnCheckedChangeListener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        val position = buttonView.tag as? Int
        position?.apply {
            val item = getItem(this)
            if (item != null)
                NlRealmBuilder.getRealm().executeTransaction {
                    item.favorite = isChecked
                }
        }


    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.product_item_alias) as TextView
        val checked: CheckBox = itemView.findViewById(R.id.product_favorite_check) as CheckBox

    }

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val next = getItem(position)
        next?.apply {
            holder.title.text = next.alias
            holder.checked.setOnCheckedChangeListener(null)
            holder.checked.isChecked = next.favorite
            holder.checked.setOnCheckedChangeListener(mOnCheckedChangeListener)
            holder.checked.tag = position
        }
    }

}

