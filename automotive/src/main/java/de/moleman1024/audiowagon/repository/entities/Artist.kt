/*
SPDX-FileCopyrightText: 2021 MoleMan1024 <moleman1024dev@gmail.com>
SPDX-License-Identifier: GPL-3.0-or-later
*/

package de.moleman1024.audiowagon.repository.entities

import androidx.room.*

@Entity
data class Artist(
    @PrimaryKey(autoGenerate = true)
    val artistId: Long = 0,
    @ColumnInfo(index = true)
    val name: String = ""
)
