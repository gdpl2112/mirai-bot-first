package io.github.kloping.game0.entity.gitee;

import io.github.kloping.url.UrlUtils;

import java.util.Objects;

/**
 * @author github.kloping
 */
public class GiteeFile extends Item {
    public String downloadUrl;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String[] getLines() {
        String ss = UrlUtils.getStringFromHttpUrl(downloadUrl);
        return ss.split("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiteeFile file = (GiteeFile) o;
        return Objects.equals(name, file.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadUrl);
    }
}
