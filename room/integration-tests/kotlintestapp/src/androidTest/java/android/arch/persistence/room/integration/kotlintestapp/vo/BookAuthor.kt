/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.arch.persistence.room.integration.kotlintestapp.vo

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey


@Entity(foreignKeys = arrayOf(
        ForeignKey(entity = Book::class,
                parentColumns = arrayOf("bookId"),
                childColumns = arrayOf("bookId"),
                onUpdate = ForeignKey.CASCADE,
                onDelete = ForeignKey.CASCADE,
                deferred = true),
        ForeignKey(entity = Author::class,
                parentColumns = arrayOf("authorId"),
                childColumns = arrayOf("authorId"),
                onUpdate = ForeignKey.CASCADE,
                onDelete = ForeignKey.CASCADE,
                deferred = true)),
        primaryKeys = arrayOf("bookId", "authorId"))
data class BookAuthor(val bookId: String, val authorId: String)
