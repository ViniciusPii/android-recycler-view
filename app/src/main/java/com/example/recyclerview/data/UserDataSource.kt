package com.example.recyclerview.data

import com.example.recyclerview.models.User

class UserDataSource {
    companion object {
        fun generateUsers(): ArrayList<User> {
            val names = listOf(
                "John",
                "Mary",
                "Robert",
                "Emma",
                "Michael",
                "Sophia",
                "William",
                "Olivia",
                "David",
                "Ava"
            )

            val professions = listOf(
                "Engineer",
                "Teacher",
                "Doctor",
                "Artist",
                "Lawyer",
                "Chef",
                "Writer",
                "Designer",
                "Developer",
                "Musician"
            )

            var userList = ArrayList<User>()

            for (i in 1..userList.size) {
                val randomName = names.random()
                val randomProfession = professions.random()
                val user = User(randomName, randomProfession)
                userList.add(user)
            }

            return userList
        }
    }
}