package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Comment;
import immobi.tec.immobitec.repositories.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements ICommentService{
    CommentRepository commentRepository;


    @Override
    public Comment getCommentById(int id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment getCommentByPost(int id) {
        return null;
    }

    @Override
    public List<Comment> getAllCommentsByPost(int id) {
        return null;
    }

    @Override
    public Comment addCommentToPost(Comment c, int id) {
        commentRepository.save(c);
        return c;
    }

    @Override
    public Comment updateComment(Comment c) {
        return commentRepository.save(c);
    }

    @Override
    public void deleteComment(int id) {
        commentRepository.deleteById(id);
    }
}
