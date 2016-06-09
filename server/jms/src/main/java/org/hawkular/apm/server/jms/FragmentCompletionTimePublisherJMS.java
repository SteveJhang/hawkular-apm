/*
 * Copyright 2015-2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
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
 */
package org.hawkular.apm.server.jms;

import javax.inject.Singleton;

import org.hawkular.apm.api.model.events.CompletionTime;
import org.hawkular.apm.server.api.services.FragmentCompletionTimePublisher;

/**
 * This class represents the trace fragment completion time JMS publisher.
 *
 * @author gbrown
 */
@Singleton
public class FragmentCompletionTimePublisherJMS extends AbstractPublisherJMS<CompletionTime>
                        implements FragmentCompletionTimePublisher {

    private static final String DESTINATION = "java:/FragmentCompletionTimes";

    /* (non-Javadoc)
     * @see org.hawkular.apm.server.jms.AbstractPublisherJMS#getDestinationURI()
     */
    @Override
    protected String getDestinationURI() {
        return DESTINATION;
    }

}