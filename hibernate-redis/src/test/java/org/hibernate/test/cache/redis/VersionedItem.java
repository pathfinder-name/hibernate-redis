package org.hibernate.test.cache.redis;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * org.hibernate.test.cache.redis.VersionedItem
 *
 * @author sunghyouk.bae@gmail.com
 * @since 13. 4. 6. 오전 12:53
 */
@Entity
@Getter
@Setter
public class VersionedItem {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    private String name;

    private String description;
}
