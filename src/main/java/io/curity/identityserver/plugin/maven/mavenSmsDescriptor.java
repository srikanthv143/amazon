package io.curity.identityserver.plugin.maven;

import se.curity.identityserver.sdk.plugin.descriptor.SmsPluginDescriptor;
import se.curity.identityserver.sdk.service.sms.SmsSender;

public final class mavenSmsDescriptor implements SmsPluginDescriptor<mavenSmsConfig>
{
    @Override
    public Class<? extends SmsSender> getSmsSenderType()
    {
        return mavenSmsSender.class;
    }

    @Override
    public String getPluginImplementationType()
    {
        return "maven";
    }

    @Override
    public Class<? extends mavenSmsConfig> getConfigurationType()
    {
        return mavenSmsConfig.class;
    }    
}
