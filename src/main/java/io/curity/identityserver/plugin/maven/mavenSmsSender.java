package io.curity.identityserver.plugin.maven;

import se.curity.identityserver.sdk.service.sms.SmsSender;

public final class mavenSmsSender implements SmsSender
{
    private final mavenSmsConfig _configuration;

    public mavenSmsSender(mavenSmsConfig configuration)
    {
        _configuration = configuration;
    }

    @Override
    public boolean sendSms(String toNumber, String msg)
    {
        // TODO: Implement sending an sms.
        // Check out the examples on GitHub: https://github.com/search?q=sms+org%3Acurityio&type=Repositories

        return true;
    }
}
