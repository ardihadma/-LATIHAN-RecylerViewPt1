package com.ardihadma.latihanview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*
import com.ardihadma.latihanview.models.blogPost as blogPost1

class BlogRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var item: List<blogPost1> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is BlogViewHolder->{
                holder.bind(item.get(position))
            }
        }
    }

    fun submitList(blogList: List<blogPost1>){
        item = blogList
    }

    override fun getItemCount(): Int {
        //mengembalikan nilai item untuk menghemat memory
        return item.size
    }
//class untuk menampilkan data pada itemview
    class BlogViewHolder constructor(
        itemView: View
    ):RecyclerView.ViewHolder(itemView){
    // variable pointer untuk menampilkan data pada layout berdasarkan ID item pada layout
        val blogImage = itemView.blog_image
        val blogTitle = itemView.blog_title
        val blogAuthor = itemView.blog_author

        //binding data dari blogpost
        fun bind(logPost: blogPost1){

            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOption)
                .load(logPost.image)
                .into(blogImage)
            //menginputkan data pada id layout
            blogTitle.setText(logPost.tittle)
            blogAuthor.setText(logPost.username)


        }
    }

}