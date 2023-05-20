package com.example.recyclerview.data

import com.example.recyclerview.models.User

class UserDataSource {
    companion object {
        fun generateUsers(): ArrayList<User> {
            val userList = ArrayList<User>()

            userList.add(
                User(
                    name = "Teste Name 1",
                    profession = "Teste Profissão 1"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 2",
                    profession = "Teste Profissão 2"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 3",
                    profession = "Teste Profissão 3"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 4",
                    profession = "Teste Profissão 4"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 5",
                    profession = "Teste Profissão 5"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 6",
                    profession = "Teste Profissão 6"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 7",
                    profession = "Teste Profissão 7"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 8",
                    profession = "Teste Profissão 8"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 9",
                    profession = "Teste Profissão 9"
                )
            )

            userList.add(
                User(
                    name = "Teste Name 10",
                    profession = "Teste Profissão 10"
                )
            )

            return userList
        }
    }
}