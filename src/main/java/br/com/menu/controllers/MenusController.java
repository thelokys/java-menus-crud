package br.com.menu.controllers;

import br.com.menu.models.Menu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menus")
public class MenusController {

  @GetMapping
  public ResponseEntity<List<Menu>> index() {
    List<Menu> menus = List.of(
      new Menu(
        (long) 0,
        "menu-1",
        "/url",
        new ArrayList<Menu>(
          List.of(new Menu((long) 0, "menu-1-1", "/url-teste"))
        )
      )
    );
    return ResponseEntity.status(200).body(menus);
  }
}
