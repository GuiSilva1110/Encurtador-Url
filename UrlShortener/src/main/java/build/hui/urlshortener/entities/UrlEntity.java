package build.hui.urlshortener.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "urls")
public class UrlEntity {
    
    @Id
    private String id;

    private String fullUrl;

    @Indexed(expireAfterSeconds = 0)
    private LocalDateTime expireAt;

    public UrlEntity(){       
    }
    public UrlEntity(String id, String fullUrl, LocalDateTime expireAt) {
        this.id = id;
        this.fullUrl = fullUrl;
        this.expireAt = expireAt;
    }
    public String getId() {
        return id;
    }
    public String getFullUrl() {
        return fullUrl;
    }
    public LocalDateTime getExpireAt() {
        return expireAt;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }
    public void setExpireAt(LocalDateTime expireAt) {
        this.expireAt = expireAt;
    }
    
}
