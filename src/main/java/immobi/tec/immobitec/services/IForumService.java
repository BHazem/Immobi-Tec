package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Forum;
import immobi.tec.immobitec.entities.Post;

import java.util.List;

public interface IForumService {

    public Forum getForumById(int id);

    public List<Forum> getAllForums();

    public Forum addForum(Forum f);

    public Forum updateForum(Forum f);

    public void deleteForum(int id);

    public List<Post> getAllPosts(int id);
}
