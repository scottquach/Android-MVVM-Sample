package com.scottquch.retrofitmvvmdemo.repos

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scottquch.retrofitmvvmdemo.BR
import com.scottquch.retrofitmvvmdemo.R
import com.scottquch.retrofitmvvmdemo.models.RepoModel

/**
 * Recycler adapter that uses databinding in order show data in the view
 */
class RepoAdapter : RecyclerView.Adapter<RepoAdapter.ViewHolder>() {

    private var repoData: List<RepoModel> = emptyList()

    interface OnClickListener {
        fun onClick(model: RepoModel, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RepoAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.row_repo, parent, false))
    }

    override fun getItemCount() = repoData.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.getBinding()?.setVariable(BR.repoModel, repoData[position])
        holder?.getBinding()?.executePendingBindings()
    }

    fun setRepoData(newData: List<RepoModel>?) {
        newData?.let {
            repoData = newData
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

        fun getBinding(): ViewDataBinding {
            return binding
        }
    }
}