package cn.qingtianr.blog.model;


/**
 * Created by jack on 16-4-8.
 */
public class ArchiveCount {
//  分类的名字
    private String archive;
//  分类的数量
    private int count;

    public ArchiveCount() {

    }

    public ArchiveCount(String archive, int count){
       this.archive = archive;
       this.count = count;
    }
    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
