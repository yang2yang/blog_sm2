package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.cn.qingtianr.factory.ServiceFactory;
import main.java.cn.qingtianr.model.Article;

import java.util.ArrayList;
/**
 * Created by jack on 16-3-30.
 */
public class ArticleAction extends ActionSupport {
    private String title;
    private String archive;
    private String content;
    private ArrayList<Article> articlelist;
    private String test;
    private Article article;

    public String writeArticle()
    {
        // todo
        Article article = new Article(title,archive,content);
        ServiceFactory.getArticleServiceInstance().addArticle(article);
        articlelist = ServiceFactory.getArticleServiceInstance().showArticle();
        return "lookarticle";
    }

    public String showArticle()
    {
        articlelist = ServiceFactory.getArticleServiceInstance().showArticle();
//        System.out.println("In action article[0].title = " + articlelist.get(0).getTitle());
        System.out.println("hello I'm showArticle");
        return "lookarticle";
    }

    public String getOneArticle()
    {
        article = ServiceFactory.getArticleServiceInstance().getOneArticle(title);
        return "post";
    }

    public String updateArticle()
    {
        article = ServiceFactory.getArticleServiceInstance().getOneArticle(title);
        return "updateOneArticle";
    }

    public String updateOneArticle()
    {
        ServiceFactory.getArticleServiceInstance().updateArticle(article);
        return "success";
    }
    public String manageArticle()
    {
        articlelist = ServiceFactory.getArticleServiceInstance().showArticle();
        System.out.println("It is in managearticle!!");
        return "managearticle";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    public void setArticlelist(ArrayList arraylist)
    {
       this.articlelist = arraylist;
    }
    public ArrayList<Article> getArticlelist()
    {
       return articlelist;
    }


    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
