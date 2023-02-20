package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.services.IPostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostController {
    IPostService iPostService;



}
