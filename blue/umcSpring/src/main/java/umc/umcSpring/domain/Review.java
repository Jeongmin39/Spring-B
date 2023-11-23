package umc.umcSpring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.umcSpring.domain.common.BaseEntity;

import javax.sound.midi.MetaMessage;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Float score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
