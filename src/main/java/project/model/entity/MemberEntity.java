package project.model.entity;

import jakarta.persistence.*;
import lombok.*;
import project.model.dto.MemberDto;

@Entity
@Table(name = "member")
@Getter@Setter@ToString@Builder
@NoArgsConstructor@AllArgsConstructor
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;
    @Column(columnDefinition = "varchar(30)", unique = true, nullable = false)
    private String mmail;
    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String mpwd;
    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String mname;
    @Column(columnDefinition = "varchar(13)", unique = true, nullable = false)
    private String mphone;

    // Entity -> Dto
    public MemberDto toMDto(){
        return MemberDto.builder()
                .mno(this.mno)
                .mmail(this.mmail)
                .mpwd(this.mpwd)
                .mname(this.mname)
                .mphone(this.mphone)
                .build();
    }
}
