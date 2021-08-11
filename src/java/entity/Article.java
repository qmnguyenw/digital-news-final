package entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author MSI
 */
public class Article {
    
    private int id;
    private String title;
    private String image;
    private String content;
    private Date uploadDate;
    private String author;

    public Article(int id, String title, String image, String content, Date uploadDate, String author) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
        this.uploadDate = uploadDate;
        this.author = author;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShortcut() {
        String shortcut;
        if (content.length() > 100) shortcut = content.substring(0, 100)+"...";
        else shortcut = content;
        return shortcut;
    }
    
    public String getFormatDate() {
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
        String monthStr = monthFormat.format(uploadDate).substring(0,3);
        return monthStr + " " + new SimpleDateFormat("dd yyyy - hh:mmaaa").format(uploadDate).toLowerCase();
    }
    
    public String getAuthorLine() {
        return "By " + author + " | " + getFormatDate();
    }
    
}
