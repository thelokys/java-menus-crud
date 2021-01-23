package br.com.menu.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {

  private Long id;
  private String name;
  private String url;
  private List<Menu> menus;

  public Menu() {}

  public Menu(Long id, String name, String url) {
    this(id, name, url, new ArrayList<Menu>());
  }

  public Menu(Long id, String name, String url, List<Menu> menus) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.menus = menus;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public List<Menu> getMenus() {
    return menus;
  }

  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }
}
