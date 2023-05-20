package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.UserCardItemBinding
import com.example.recyclerview.models.User

class UserViewHolder constructor(
    private val binding: UserCardItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(user: User) {
        binding.userName.text = user.name
        binding.profession.text = user.profession
    }
}