package project.model.dto;

import lombok.*;
import project.model.entity.MemberEntity;

@Getter@Setter@ToString@Builder
@NoArgsConstructor@AllArgsConstructor
public class MemberDto {
    private int mno;
    private String mmail;
    private String mpwd;
    private String mname;
    private String mphone;
    private String cdate;
    private String udate;

    // Dto -> Entity
    public MemberEntity toMEntity() {
        return MemberEntity.builder()
                .mno(this.mno)
                .mmail(this.mmail)
                .mpwd(this.mpwd)
                .mname(this.mname)
                .mphone(this.mphone)
                .build();
    }
}
