package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Forum;
import immobi.tec.immobitec.entities.Post;
import immobi.tec.immobitec.repositories.ForumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ForumServiceImpl implements IForumService {
    ForumRepository forumRepository;

    @Override
    public Forum getForumById(int id) {
        return forumRepository.findById(id).orElse(null);
    }

    @Override
    public List<Forum> getAllForums() {
        return forumRepository.findAll();
    }

    @Override
    public Forum addForum(Forum f) {
        return forumRepository.save(f);
    }

    @Override
    public Forum updateForum(Forum f) {
        return forumRepository.save(f);
    }

    @Override
    public void deleteForum(int id) {
        forumRepository.deleteById(id);
    }

    @Override
    public List<Post> getAllPosts(int id) {
        Forum f=forumRepository.findById(id).orElse(null);
        return (List<Post>) f.getPosts();
    }
}
