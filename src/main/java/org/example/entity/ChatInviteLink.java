package org.example.entity;

import lombok.Data;

@Data
public class ChatInviteLink {
    /**
     * The invite link. If the link was created by another chat administrator, then the second part of the link will be replaced with "...".
     */
    private String inviteLink;

    /**
     * Creator of the link.
     */
    private User creator;

    /**
     * True, if users joining the chat via the link need to be approved by chat administrators.
     */
    private boolean createsJoinRequest;

    /**
     * True, if the link is primary.
     */
    private boolean isPrimary;

    /**
     * True, if the link is revoked.
     */
    private boolean isRevoked;

    /**
     * (Optional) Invite link name.
     */
    private String name;

    /**
     * (Optional) Point in time (Unix timestamp) when the link will expire or has been expired.
     */
    private int expireDate;

    /**
     * (Optional) The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999.
     */
    private int memberLimit;

    /**
     * (Optional) Number of pending join requests created using this link.
     */
    private int pendingJoinRequestCount;

    // You can also add custom methods and additional fields as per your requirements
}

