package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Post;
import immobi.tec.immobitec.repositories.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements IPostService{
    PostRepository postRepository;

    @Override
    public Post getPostById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post addPost(Post p) {
        return postRepository.save(p);
    }

    @Override
    public Post updatePost(Post p) {
        return postRepository.save(p);
    }

    @Override
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }
}
