package com.cognifide.slice.core.internal.context;

/*
 * #%L
 * Slice - Core
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 Cognifide Limited
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.cognifide.slice.api.context.Context;
import com.cognifide.slice.api.context.SimpleContextProvider;

public class SimpleContextProviderImpl implements SimpleContextProvider {

	private Context context;

	public void setContext(final Context context) {
		this.context = context;
	}

	public Context getContext() {
		return context;
	}

}
