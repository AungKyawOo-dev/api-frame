package api.entity;

import java.util.Date;

/**
 * @author Aung Kyaw Oo
 *
 */
public class Post {

	/**
	 * id
	 */
	public int id;
	/**
	 * title
	 */
	public String title;
	/**
	 * description
	 */
	public String description;
	/**
	 * status
	 */
	public short status;
	/**
	 * create_user_id
	 */
	public int create_user_id;
	/**
	 * updated_user_id
	 */
	public int updated_user_id;
	/**
	 * deleted_user_id
	 */
	public int deleted_user_id;
	/**
	 * updated_at
	 */
	public Date updated_at;
	/**
	 * deleted_at
	 */
	public Date deleted_at;
	/**
	 * created_at
	 */
	public Date created_at;

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return short
	 */
	public short getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(short status) {
		this.status = status;
	}

	/**
	 * @return int
	 */
	public int getCreate_user_id() {
		return create_user_id;
	}

	/**
	 * @param create_user_id
	 */
	public void setCreate_user_id(int create_user_id) {
		this.create_user_id = create_user_id;
	}

	/**
	 * @return int
	 */
	public int getUpdated_user_id() {
		return updated_user_id;
	}

	/**
	 * @param updated_user_id
	 */
	public void setUpdated_user_id(int updated_user_id) {
		this.updated_user_id = updated_user_id;
	}

	/**
	 * @return
	 */
	public int getDeleted_user_id() {
		return deleted_user_id;
	}

	/**
	 * @param deleted_user_id
	 */
	public void setDeleted_user_id(int deleted_user_id) {
		this.deleted_user_id = deleted_user_id;
	}

	/**
	 * @return Date
	 */
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * @return Date
	 */
	public Date getDeleted_at() {
		return deleted_at;
	}

	/**
	 * @param deleted_at
	 */
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	/**
	 * @return Date
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

}
