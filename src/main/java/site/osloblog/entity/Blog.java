package site.osloblog.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import site.osloblog.base.BaseEntity;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "blog_tb")
public class Blog extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long blogId;

  @Column(nullable = false, length = 100, name = "blog_title")
  private String title;

  @Column(nullable = false, length = 3000, name = "blog_content")
  private String content;

}
