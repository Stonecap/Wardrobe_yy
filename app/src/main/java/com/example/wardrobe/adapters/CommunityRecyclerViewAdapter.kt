package com.example.wardrobe.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.wardrobe.R
import com.example.wardrobe.viewmodel.WardrobeViewModel

class CommunityRecyclerViewAdapter(private val viewModel: WardrobeViewModel, val context: Context?, val fragment: Fragment):
    RecyclerView.Adapter<CommunityRecyclerViewAdapter.RecyclerViewViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.itemview_community,
            parent, false)
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = ItemViewBinding.inflate(inflater,parent,false)
        return RecyclerViewViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.setContents(position)
    }

    override fun getItemCount(): Int {
        // 옷 개수
        return viewModel.communityItems.size
    }

    inner class RecyclerViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

//        val db = Firebase.firestore
//        val currentUid = Firebase.auth.currentUser?.uid.toString()


        private val clothesImage: ImageView = itemView.findViewById(R.id.iv_clothes)

        fun setContents(pos: Int){
            with(viewModel.communityItems[pos]){
                // clothesImage 세팅
                clothesImage.setImageResource(clothesImageUrl)
//                Glide.with(itemView).load(clothesImageUrl).into(clothesImage)
            }


            clothesImage.setOnClickListener {

            }
        }

    }

}