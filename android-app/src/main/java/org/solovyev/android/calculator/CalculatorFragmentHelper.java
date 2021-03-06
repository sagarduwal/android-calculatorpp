/*
 * Copyright 2013 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.calculator;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * User: serso
 * Date: 9/26/12
 * Time: 10:14 PM
 */
public interface CalculatorFragmentHelper {

	boolean isPane(@Nonnull Fragment fragment);

	void setPaneTitle(@Nonnull Fragment fragment, int titleResId);

	void onCreate(@Nonnull Fragment fragment);

	@Nonnull
	View onCreateView(@Nonnull Fragment fragment, @Nonnull LayoutInflater inflater, @Nullable ViewGroup container);

	void onViewCreated(@Nonnull Fragment fragment, @Nonnull View root);

	void onResume(@Nonnull Fragment fragment);

	void onPause(@Nonnull Fragment fragment);

	void onDestroy(@Nonnull Fragment fragment);
}
