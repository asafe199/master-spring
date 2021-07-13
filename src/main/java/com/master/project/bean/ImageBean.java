package com.master.project.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageBean {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "author")
    private String author;
    @JsonProperty(value = "download_url")
    private String download;
    @JsonProperty(value = "url")
    private String url;
}

