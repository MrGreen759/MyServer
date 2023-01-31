package ru.netology.nmedia.repository

import ru.netology.nmedia.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<PostEntity, Long>