package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.cn.qingtianr.factory.ServiceFactory;
import main.java.cn.qingtianr.model.Archive;
import main.java.cn.qingtianr.model.ArchiveCount;
import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.service.ArchiveService;
import main.java.cn.qingtianr.service.ArticleService;

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
    private int count;
    private ArrayList<ArchiveCount> archivecountlist;
    private ArticleService articlesi;
    private ArchiveService archivesi;

//  调用写文章的函数，写完之后，返回一个articlelist的列表
    public String writeArticle()
    {
        // todo
        Article article = new Article(title,archive,content);
        articlesi.addArticle(article);
        articlelist = articlesi.showArticle();
        return "lookarticle";
    }

//  调用显示的文章的函数,并将结果显示出来。
    public String showArticle()
    {
        articlelist = articlesi.showArticle();
//        System.out.println("In action article[0].title = " + articlelist.get(0).getTitle());
        System.out.println("hello I'm showArticle");
//      这里需要从分类的数据库表中取到数据,现在暂时还是模拟
//      从数据库里面取到了分类的数据后
        ArrayList<Archive> archivelist = archivesi.getAllArchive();
        for(int i = 0; i < archivelist.size();i++)
        {
            System.out.println("**************");
            System.out.println(archivelist.get(i).getArchive());
            System.out.println("**************");
        }
        archivecountlist = new ArrayList<ArchiveCount>();
//      将所有list里面的数据都放在archivecountlist中

        for(int i = 0; i < archivelist.size();i++) {
            archivecountlist.add(new ArchiveCount(archivelist.get(i).getArchive(),0));
        }
//      这里将archivecountlist中存储的分类进行统计,需要改成循环的来做
        for (int i = 0;i < archivecountlist.size();i++)
        {
            count = articlesi.countArticle(archivecountlist.get(i).getArchive());
            archivecountlist.get(i).setCount(count);
        }
        return "lookarticle";
    }

    public String getOneArticle()
    {
        article = articlesi.getOneArticle(title);
        return "post";
    }

    public String updateArticle()
    {
        article = articlesi.getOneArticle(title);
        return "updateOneArticle";
    }

    public String updateOneArticle()
    {
        articlesi.updateArticle(article);
        articlelist = articlesi.showArticle();
        return "success";
    }
    public String manageArticle()
    {
        articlelist = articlesi.showArticle();
        System.out.println("It is in managearticle!!");
        return "managearticle";
    }

    public String deleteArticle()
    {
        articlesi.deleteArticle(title);
        articlelist = articlesi.showArticle();
        return "success";
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<ArchiveCount> getArchivecountlist() {
        return archivecountlist;
    }

    public void setArchivecountlist(ArrayList<ArchiveCount> archivecountlist) {
        this.archivecountlist = archivecountlist;
    }

    public void setArticlesi(ArticleService articlesi) {
        this.articlesi = articlesi;
    }

    public void setArchivesi(ArchiveService archivesi) {
        this.archivesi = archivesi;
    }
}
