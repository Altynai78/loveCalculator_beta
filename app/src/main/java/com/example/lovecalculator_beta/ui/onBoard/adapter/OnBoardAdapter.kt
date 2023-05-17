package com.example.lovecalculator_beta.ui.onBoard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lovecalculator_beta.model.OnBoard


class OnBoardAdapter(private val onClick:() -> Unit): RecyclerView.Adapter<OnBoardAdapter.OnBoardViewHolder>() {


    private val data = arrayListOf(
        OnBoard("https://www.chanty.com/blog/wp-content/uploads/2020/10/Task-manager-apps-scaled.jpg", "At First", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse euismod consectetur ex, at pellentesque massa vehicula sit amet. Duis pretium, sem at porttitor euismod, risus urna ullamcorper quam, nec sodales."),
        OnBoard("https://www.meistertask.com/blog/wp-content/uploads/2018/03/Zapier_Automations.png", "At Second", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce quis sem dapibus arcu finibus tristique. Ut porttitor tristique orci id gravida. Ut rutrum purus metus, nec vestibulum erat pharetra eleifend. Integer"),
        OnBoard("https://project-management.com/wp-content/uploads/2023/01/pmcom-11923-clickup-alts.jpeg", "At Third", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac gravida felis, vitae scelerisque sem. Aliquam erat volutpat. Nullam eget velit non ex dignissim scelerisque ut ac augue. Donec ultrices mauris quis consectetur.")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardViewHolder {
        return OnBoardViewHolder(ItemOnBoardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: OnBoardViewHolder, position: Int) {
        holder.bind(data[position])
    }

    inner class OnBoardViewHolder(private val binding: ItemOnBoardBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(onBoard: OnBoard) {
            binding.apply {
                tvTitle.text = onBoard.title
                tvDesc.text = onBoard.desc
                imgBoard.loadImage(onBoard.image)
                btnStart.isVisible = adapterPosition == 2
                btnStart.setOnClickListener {
                    onClick()
                }
            }
        }


    }
}