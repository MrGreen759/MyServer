package ru.netology.nmedia.controller

import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.service.PostService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/posts", "/api/slow/posts")
open class PostController(private val service: PostService) {
    @GetMapping
    fun getAll() = service.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = service.getById(id)

    @PostMapping
    fun save(@RequestBody dto: Post) = service.save(dto)

    @DeleteMapping("/{id}")
    fun removeById(@PathVariable id: Long) = service.removeById(id)

    @PostMapping("/{id}/likes")
    fun likeById(@PathVariable id: Long) = service.likeById(id)

    @DeleteMapping("/{id}/likes")
    fun unlikeById(@PathVariable id: Long) = service.unlikeById(id)

    @DeleteMapping("/{id}/share")
    fun shareById(@PathVariable id: Long) = service.shareById(id)

}