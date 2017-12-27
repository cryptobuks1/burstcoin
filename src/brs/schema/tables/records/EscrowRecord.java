/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables.records;


import brs.schema.tables.Escrow;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EscrowRecord extends UpdatableRecordImpl<EscrowRecord> implements Record10<Long, Long, Long, Long, Long, Integer, Integer, Integer, Integer, Boolean> {

    private static final long serialVersionUID = 231629969;

    /**
     * Setter for <code>DB.escrow.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.escrow.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB.escrow.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB.escrow.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>DB.escrow.sender_id</code>.
     */
    public void setSenderId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB.escrow.sender_id</code>.
     */
    public Long getSenderId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>DB.escrow.recipient_id</code>.
     */
    public void setRecipientId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB.escrow.recipient_id</code>.
     */
    public Long getRecipientId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB.escrow.amount</code>.
     */
    public void setAmount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB.escrow.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>DB.escrow.required_signers</code>.
     */
    public void setRequiredSigners(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB.escrow.required_signers</code>.
     */
    public Integer getRequiredSigners() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB.escrow.deadline</code>.
     */
    public void setDeadline(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>DB.escrow.deadline</code>.
     */
    public Integer getDeadline() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DB.escrow.deadline_action</code>.
     */
    public void setDeadlineAction(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>DB.escrow.deadline_action</code>.
     */
    public Integer getDeadlineAction() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>DB.escrow.height</code>.
     */
    public void setHeight(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>DB.escrow.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>DB.escrow.latest</code>.
     */
    public void setLatest(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>DB.escrow.latest</code>.
     */
    public Boolean getLatest() {
        return (Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Long, Long, Integer, Integer, Integer, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Long, Long, Integer, Integer, Integer, Integer, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Escrow.ESCROW.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Escrow.ESCROW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Escrow.ESCROW.SENDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Escrow.ESCROW.RECIPIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Escrow.ESCROW.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Escrow.ESCROW.REQUIRED_SIGNERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Escrow.ESCROW.DEADLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Escrow.ESCROW.DEADLINE_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Escrow.ESCROW.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Escrow.ESCROW.LATEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSenderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRecipientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRequiredSigners();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getDeadlineAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getLatest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSenderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRecipientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRequiredSigners();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getDeadlineAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getLatest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value2(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value3(Long value) {
        setSenderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value4(Long value) {
        setRecipientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value5(Long value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value6(Integer value) {
        setRequiredSigners(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value7(Integer value) {
        setDeadline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value8(Integer value) {
        setDeadlineAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value9(Integer value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord value10(Boolean value) {
        setLatest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EscrowRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Integer value6, Integer value7, Integer value8, Integer value9, Boolean value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EscrowRecord
     */
    public EscrowRecord() {
        super(Escrow.ESCROW);
    }

    /**
     * Create a detached, initialised EscrowRecord
     */
    public EscrowRecord(Long dbId, Long id, Long senderId, Long recipientId, Long amount, Integer requiredSigners, Integer deadline, Integer deadlineAction, Integer height, Boolean latest) {
        super(Escrow.ESCROW);

        set(0, dbId);
        set(1, id);
        set(2, senderId);
        set(3, recipientId);
        set(4, amount);
        set(5, requiredSigners);
        set(6, deadline);
        set(7, deadlineAction);
        set(8, height);
        set(9, latest);
    }
}
