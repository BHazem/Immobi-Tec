package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.Forum;
import immobi.tec.immobitec.entities.Post;
import immobi.tec.immobitec.services.IForumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class ForumController {
    IForumService iForumService;

    @GetMapping("/AllForums")
        public List<String> allForums(){
            List<String> forums=new ArrayList<>();
            for (Forum f:iForumService.getAllForums()) {
                forums.add(f.getTitle());
            }
        return forums;
        }

    @GetMapping("/AllPosts/{id}")
        public List<Post> allPosts(@PathVariable("id") int id){
        return iForumService.getAllPosts(id);
    }

    @GetMapping("/ForumById/{id}")
    public Forum getForumById(@PathVariable("id") int id){
        return iForumService.getForumById(id);
    }

    @PostMapping("/AddForum")
    public Forum addForum(@RequestBody Forum f){
        return iForumService.addForum(f);
    }

    @DeleteMapping("/deleteForum/{id}")
    public void deleteForum(@PathVariable("id") int id){
        iForumService.deleteForum(id);
    }
}
