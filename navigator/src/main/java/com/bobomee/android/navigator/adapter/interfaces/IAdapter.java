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

package com.bobomee.android.navigator.adapter.interfaces;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created on 2016/10/24.下午9:04.
 *
 * @author bobomee.
 */

public interface IAdapter<T> {

  void registerDataSetObserver(DataSetObserver observer);

  void unregisterDataSetObserver(DataSetObserver observer);

  int getCount();

  void notifyDataSetChanged();

  void notifyDataSetInvalidated();

  T getItem(int position);

  View getView(int position, ViewGroup parent, T object);

  View getDropView(int position, ViewGroup parent, T object);
}
