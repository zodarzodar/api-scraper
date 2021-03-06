/*
 * Copyright 2012 - 2016 Manuel Laggner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tinymediamanager.scraper.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * This class represents a TV show episode including its meta data.
 * 
 * @author Manuel Laggner
 * @since 1.0
 */
public class MediaEpisode {
  public final String                  providerId;
  /** a hashmap storing ids */
  public final HashMap<String, Object> ids         = new HashMap<>();
  public int                           season      = -1;
  public int                           episode     = -1;
  public int                           dvdSeason   = -1;
  public int                           dvdEpisode  = -1;
  public String                        title       = "";
  public String                        plot        = "";
  public float                         rating      = 0.0f;
  public int                           voteCount   = 0;
  public String                        firstAired  = "";

  public final List<MediaCastMember>   castMembers = new ArrayList<>();
  public final List<MediaArtwork>      artwork     = new ArrayList<>();

  public MediaEpisode(String providerId) {
    this.providerId = providerId;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
