package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Comment;

import java.util.List;

public interface ICommentService {
    public Comment getCommentById(int id);

    public Comment getCommentByPost(int id);

    public List<Comment> getAllCommentsByPost(int id);

    public Comment addCommentToPost(Comment c,int id);

    public Comment updateComment(Comment c);

    public void deleteComment(int id);
}
