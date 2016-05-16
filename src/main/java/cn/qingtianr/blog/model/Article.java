package cn.qingtianr.blog.model;

import java.sql.Date;

/**
 * Created by jack on 16-3-30.
 */
public class Article {
    
    // id
    private int id;
    // 标题
    private String title;
    // 
    private String archive;
    // 创建时间
    private Date datetime;
    // 内容
    private String content;
    
    /**
     * id.
     *
     * @return  the id
     * @since   JDK 1.6
     */
    public int getId() {
        return id;
    }
    
    /**
     * id.
     *
     * @param   id    the id to set
     * @since   JDK 1.6
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * title.
     *
     * @return  the title
     * @since   JDK 1.6
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * title.
     *
     * @param   title    the title to set
     * @since   JDK 1.6
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * archive.
     *
     * @return  the archive
     * @since   JDK 1.6
     */
    public String getArchive() {
        return archive;
    }
    
    /**
     * archive.
     *
     * @param   archive    the archive to set
     * @since   JDK 1.6
     */
    public void setArchive(String archive) {
        this.archive = archive;
    }
    
    /**
     * datetime.
     *
     * @return  the datetime
     * @since   JDK 1.6
     */
    public Date getDatetime() {
        return datetime;
    }
    
    /**
     * datetime.
     *
     * @param   datetime    the datetime to set
     * @since   JDK 1.6
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    
    /**
     * content.
     *
     * @return  the content
     * @since   JDK 1.6
     */
    public String getContent() {
        return content;
    }
    
    /**
     * content.
     *
     * @param   content    the content to set
     * @since   JDK 1.6
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Article [id=");
        builder.append(id);
        builder.append(", title=");
        builder.append(title);
        builder.append(", archive=");
        builder.append(archive);
        builder.append(", datetime=");
        builder.append(datetime);
        builder.append(", content=");
        builder.append(content);
        builder.append("]");
        return builder.toString();
    }

}
