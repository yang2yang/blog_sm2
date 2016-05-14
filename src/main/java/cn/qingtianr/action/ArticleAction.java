package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.cn.qingtianr.model.*;
import main.java.cn.qingtianr.service.ArchiveService;
import main.java.cn.qingtianr.service.ArticleService;
import main.java.cn.qingtianr.service.CommentService;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 * Created by jack on 16-3-30.
 */
public class ArticleAction extends ActionSupport {
    private String title;
    private String archive;
    private String content;
    private Date datetime;
    private List<Article> articlelist;
    private String test;
    private Article article;
    private int count;
    private ArrayList<ArchiveCount> archivecountlist;
    private ArticleService articlesi;
    private ArchiveService archivesi;
    private int page;
    private int[] numberlist;
    private List<ArticleCount> articlecount;
    private CommentService commentsi;
    private ArrayList<Comment> commentlist;

//  调用写文章的函数，写完之后，返回一个articlelist的列表
    public String writeArticle()
    {
        Article article = new Article(title,archive,content,datetime);
        articlesi.addArticle(article);
        articlelist = articlesi.showArticle();
        return "lookarticle";
    }

//  调用显示的文章的函数,并将结果显示出来。
    public String showArticle()
    {

        ArrayList<Article> articlelist_copy = new ArrayList();
        System.out.println("page="+page);
        if(page == 0){
            page = 1;
        }
        articlelist_copy = articlesi.showArticle();
//      调用articlesi中的函数来将数据取出来
        articlecount = new ArrayList<ArticleCount>();
        articlecount = articlesi.countDatetime();
//        for(int i = 0;i < articlecount.size();i++){
//            System.out.println(articlecount.get(i).getDatetime());
//            System.out.println(articlecount.get(i).getCount());
//        }
//        for(int i = 0;i < articlelist_copy.size() - 1;i++){
//            if(articlelist_copy.get(i).getDatetime() == articlelist_copy.get(i+1).getDatetime()){
//
//            }
//        }

        //设置每一页的文章数量
        int pagesize = 2;
        int firstarticle = (page - 1) * pagesize;
        int lastarticle = page * pagesize;
        if(lastarticle > articlelist_copy.size()){
            lastarticle = articlelist_copy.size();
        }

        double pagedou = Math.ceil((double)articlelist_copy.size()/pagesize);
        int pages = (int)pagedou;
        System.out.println(pages);
        numberlist = new int[pages];
        for(int i=0;i < pages;i++) {
            numberlist[i] = i+1;
            System.out.println(i+"="+numberlist[i]);
        }
        //列表每一次编辑的时候都需要强制转化一个类型
        System.out.println(firstarticle+" "+lastarticle);
        articlelist = articlelist_copy.subList(firstarticle,lastarticle);
//        System.out.println("In action article[0].title = " + articlelist.get(0).getTitle());
        System.out.println("hello I'm showArticle");
//      从数据库里面取到了分类的数据后
//        ArrayList<Archive> archivelist = archivesi.getAllArchive();
//        for(int i = 0; i < archivelist.size();i++)
//        {
//            System.out.println("**************");
//            System.out.println(archivelist.get(i).getArchive());
//            System.out.println("**************");
//        }
//        archivecountlist = new ArrayList<ArchiveCount>();
//      将所有list里面的数据都放在archivecountlist中

//        for(int i = 0; i < archivelist.size();i++) {
//            archivecountlist.add(new ArchiveCount(archivelist.get(i).getArchive(),0));
//        }
//      这里将archivecountlist中存储的分类进行统计,需要改成循环的来做
//        for (int i = 0;i < archivecountlist.size();i++)
//        {
//            count = articlesi.countArticle(archivecountlist.get(i).getArchive());
//            archivecountlist.get(i).setCount(count);
//        }
        return "sayarticle";
    }


    public String getOneArticle()
    {
        article = articlesi.getOneArticle(title);
        commentlist = commentsi.showPostComment(article);
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
        System.out.println("article[1].title = " + articlelist.get(0).getDatetime());
        System.out.println("It is in managearticle!!");
        return "managearticle";
    }

    public String deleteArticle()
    {
        articlesi.deleteArticle(title);
        articlelist = articlesi.showArticle();
        return "success";
    }

    public String showDatetimeArticle(){
        articlelist = articlesi.showDatetimeArticle(datetime);
        articlecount = articlesi.countDatetime();
//        暂时不弄分页
        return "sayarticle";
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
    public List getArticlelist()
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

    public void setPage(int page) {
        this.page = page;
    }
    public int getPage(){
        return page;
    }

    public int[] getNumberlist() {
        return numberlist;
    }

    public void setNumberlist(int[] numberlist) {
        this.numberlist = numberlist;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public List<ArticleCount> getArticlecount() {
        return articlecount;
    }

    public void setArticlecount(List<ArticleCount> articlecount) {
        this.articlecount = articlecount;
    }

    public ArrayList<Comment> getCommentlist() {
        return commentlist;
    }

    public void setCommentlist(ArrayList<Comment> commentlist) {
        this.commentlist = commentlist;
    }

    public CommentService getCommentsi() {
        return commentsi;
    }

    public void setCommentsi(CommentService commentsi) {
        this.commentsi = commentsi;
    }
}
