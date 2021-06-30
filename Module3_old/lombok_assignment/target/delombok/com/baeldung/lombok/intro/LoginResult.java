// Generated by delombok at Tue Jun 29 20:53:44 EDT 2021
package com.baeldung.lombok.intro;

import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import lombok.NonNull;

public class LoginResult {
    @NonNull
    private final Instant loginTs;
    @NonNull
    private final String authToken;
    @NonNull
    private final Duration tokenValidity;
    @NonNull
    private final URL tokenRefreshUrl;

    @SuppressWarnings("all")
    public LoginResult(@NonNull final Instant loginTs, @NonNull final String authToken, @NonNull final Duration tokenValidity, @NonNull final URL tokenRefreshUrl) {
        if (loginTs == null) {
            throw new NullPointerException("loginTs is marked non-null but is null");
        }
        if (authToken == null) {
            throw new NullPointerException("authToken is marked non-null but is null");
        }
        if (tokenValidity == null) {
            throw new NullPointerException("tokenValidity is marked non-null but is null");
        }
        if (tokenRefreshUrl == null) {
            throw new NullPointerException("tokenRefreshUrl is marked non-null but is null");
        }
        this.loginTs = loginTs;
        this.authToken = authToken;
        this.tokenValidity = tokenValidity;
        this.tokenRefreshUrl = tokenRefreshUrl;
    }

    @NonNull
    @SuppressWarnings("all")
    public Instant loginTs() {
        return this.loginTs;
    }

    @NonNull
    @SuppressWarnings("all")
    public String authToken() {
        return this.authToken;
    }

    @NonNull
    @SuppressWarnings("all")
    public Duration tokenValidity() {
        return this.tokenValidity;
    }

    @NonNull
    @SuppressWarnings("all")
    public URL tokenRefreshUrl() {
        return this.tokenRefreshUrl;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginResult)) return false;
        final LoginResult other = (LoginResult) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$authToken = this.authToken();
        final Object other$authToken = other.authToken();
        if (this$authToken == null ? other$authToken != null : !this$authToken.equals(other$authToken)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof LoginResult;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $authToken = this.authToken();
        result = result * PRIME + ($authToken == null ? 43 : $authToken.hashCode());
        return result;
    }
}
