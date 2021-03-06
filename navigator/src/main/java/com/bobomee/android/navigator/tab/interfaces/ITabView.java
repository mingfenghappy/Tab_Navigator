/*
 * Copyright (C) 2017.  BoBoMEe(wbwjx115@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.bobomee.android.navigator.tab.interfaces;

import android.widget.Checkable;

/**
 * Created on 2016/10/24.下午11:52.
 *
 * @author bobomee.
 */

public interface ITabView extends Checkable {

  void addOnCheckedChangeListener(OnTabViewCheckedChangeListener listener);

  boolean removeOnCheckedChangeListener(OnTabViewCheckedChangeListener listener);

  /**
   * {@link android.view.View#setId(int)}
   * @return  get the id of view
   */
  int getId();
}
