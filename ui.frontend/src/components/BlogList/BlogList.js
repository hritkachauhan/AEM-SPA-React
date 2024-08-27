import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
require('./BlogList.css');

const formatDate = (dateString) => {
    const date = new Date(dateString);
    const options = { year: 'numeric', month: 'long', day: 'numeric' };
    return date.toLocaleDateString('en-US', options);
};

// Define the CustomEditConfig
export const CustomEditConfig = {
    emptyLabel: 'Blog List',
    isEmpty: function(props) {
        return !props || !props.blogList || props.blogList.length === 0;
    }
};

// Define the BlogList component
export default function BlogList(props) {

    const blogListItems = Array.isArray(props.blogList) ? props.blogList : [];

    if (CustomEditConfig.isEmpty(props)) {
        return <div><h1>Hello</h1></div>;
    }

    return (
        <section className="blog-tiles">
            <div className="blog-tiles-list">
                {blogListItems.map((item, index) => {
                    // Format the date using the custom function
                    const formattedDate = formatDate(item.blogDate);

                    return (
                        <a href={item.blogLink} style={{ textDecoration: "none" }} className="blog-item" key={index}>
                            <div
                                id="dispatcher"
                                className="blog-item-div"
                                style={{
                                    border: "1px solid #ccc",
                                    borderRadius: "8px",
                                    overflow: "hidden",
                                    boxShadow: "0 4px 8px rgba(0, 0, 0, 0.1)"
                                }}
                            >
                                <img
                                    src={item.blogImg}
                                    alt="Card Image"
                                    style={{ width: "100%", height: "auto", display: "block" }}
                                />
                                <div style={{ padding: "16px" }}>
                                    <p
                                        className="dispatcherTag"
                                        style={{
                                            marginTop: "7px",
                                            marginBottom: "7px",
                                            fontSize: "13px",
                                            borderRadius: "20px",
                                            width: "fit-content",
                                            padding: "3px 15px"
                                        }}
                                    >
                                        {item.blogName}
                                    </p>
                                    <div className="one-line">
                                        <p className="blog-title" style={{ fontSize: "1em", color: "#555" }}>
                                            {item.blogTitle}
                                        </p>
                                    </div>
                                    <p className="publishDate">{formattedDate}</p> {/* Display the formatted date */}
                                </div>
                            </div>
                        </a>
                    );
                })}
            </div>
        </section>
    );
}

// Map the BlogList component to the AEM component type
MapTo('spa-react/components/content/blogList')(BlogList, CustomEditConfig);
