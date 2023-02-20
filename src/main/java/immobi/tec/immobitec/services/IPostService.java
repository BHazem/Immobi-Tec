package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Post;

import java.util.List;

public interface IPostService {
    public Post getPostById(int id);

    public List<Post> getAllPosts();

    public Post addPost(Post p);

    public Post updatePost(Post p);

    public void deletePost(int id);

}
