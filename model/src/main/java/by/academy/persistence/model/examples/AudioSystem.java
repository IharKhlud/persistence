package by.academy.persistence.model.examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class AudioSystem {
    @Column(name = "music_power")
    private Integer musicPower;
    @Column(name = "music_name")
    private String musicName;
    @Column(name = "speakers")
    private Integer speakers;
}
